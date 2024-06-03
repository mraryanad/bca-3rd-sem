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



$conn->close();