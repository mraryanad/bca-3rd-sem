<?php
// Database credentials
$hostname = 'localhost';
$username = 'root';
$password= '';
$database = 'debit_credit_tracker';

// Create Connection
$conn = new mysqli($hostname, $username, $password, $database);

// Check Connection
if($conn->connect_error){
    die("Connection Error".$conn->connect_error);
}

// Fetch Data
$sql_query = "SELECT * FROM transaction";

// CREATE VIEW transaction_ledger_view AS
// SELECT 
//     t.id AS transaction_id,
//     t.is_debit_or_credit,
//     t.amount,
//     l.id AS ledger_id,
//     l.entity
// FROM 
//     transaction t
// INNER JOIN 
//     ledger l
// ON 
//     t.ledger_id = l.id;
// view is a dynamically updating snapshot of the joined table
// SELECT * FROM transaction_ledger_view;  To display

$result = $conn->query($sql_query);

// Store the fetched data in an array
$transaction_data = [];
if($result->num_rows>0){
    while($row = $result->fetch_assoc()){
       $transaction_data[] = $row; 
    }
}
$conn->close();