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

// if ($_SERVER['REQUEST_METHOD'] === 'POST') {
//     // Fetch the transaction ID from the request
//     $transaction_id = $_POST['id'];

//     // Run the delete query
//     $sql = "DELETE FROM transaction WHERE id='$transaction_id'";
//     $result = $conn->query($sql);

//     // If success return back
//     if($result == true){
//         header('Location: /webtech/transaction.php');
//     }

//     $conn->close();
// }

// Check if the id parameter is provided
if(isset($_GET['transaction_id'])){
    $transaction_id = $_GET['transaction_id'];

    // Prepare the SQL query to delete the transaction entry
    $delete_transaction_query = "DELETE FROM `transaction` WHERE `id` = $transaction_id";
    $delete_transaction_result = $conn->query($delete_transaction_query);

    // Execute the query and check if it was successful
    if($delete_transaction_result == true){
        header('Location: /webtech/transaction.php');
    } else {
        echo "Error deleting transaction entry: ".$stmt->error;
    }
    
    // Close the statement
    $stmt->close();
} else {
    echo "NO ID PROVIDED!!!";
}

$conn->close();