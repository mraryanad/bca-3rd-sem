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

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    // Fetch the transaction ID from the request
    $transaction_id = $_POST['id'];

    // Run the delete query
    $sql = "DELETE FROM transaction WHERE id='$transaction_id'";
    $result = $conn->query($sql);

    // If success return back
    if($result == true){
        header('Location: /webtech/transaction.php');
    }

    $conn->close();
}

$conn->close();