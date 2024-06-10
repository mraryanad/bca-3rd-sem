<?php
// database connection parameters
$hostname = 'localhost';
$username = 'root';
$password = '';
$database = 'debit_credit_tracker';

// Create connection
$conn = new mysqli($hostname, $username, $password, $database);

// Check connection
if($conn->connect_error){
    die("Connection Error: ".$conn->connect_error);
}

// Check if the ID Parameter and form data are provided
if(isset($_GET['transaction_id'])) {
    $transaction_id = intval($_GET['transaction_id']);
    $is_debit_or_credit = $_POST['is_debit_or_credit'];
    $amount = $_POST['amount'];
    $ledger_id = $_POST['ledger_id'];

    $update_transaction_query = "UPDATE `transaction` SET  `is_debit_or_credit` = '$is_debit_or_credit', `amount` = '$amount', `ledger_id` = '$ledger_id' WHERE `id` = '$transaction_id'";
    $stmt = $conn->query($update_transaction_query);

    if($stmt == true){
        header('Location: /webtech/transaction.php');
        exit();
    }
}

$conn->close();