<?php
// database connection parameters
$hostname = 'localhost';
$username = 'root';
$password = '';
$database = 'debit_credit_tracker';

// create connection
$conn = new mysqli($hostname, $username, $password, $database);

// check connection
if($conn->connect_error){
    die("Connection Error: ".$conn->connect_error);
} else {
    echo "Connected Successfully <br/>";
}

// fetch data
$sql_query = "SELECT * FROM ledger";
$result = $conn->query($sql_query);

// check if the query is executed successfully
if($result){
    if($result->num_rows > 0){
        // store fetched in array
        $rows = [];
        // fetch each row and store it
        while($row = $result->fetch_assoc()){
            $rows[] = $row;
        }

        for($i = 0; $i < count($rows); $i++){
            // access and display the id
            echo "id: ".$rows[$i]["id"].",ledger_name:".$rows[$i]["entity"]."<br/>";
        }
    } else {
        echo "0 results found";
    }
} else {
    echo "Query Failed: ".$conn->error; // message if query execution failed
}
$conn->close(); // close the database connection