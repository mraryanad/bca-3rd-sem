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
} else {
    echo "Connected Successfully <br/>";
}

// Fetch data
$sql_query = "SELECT * FROM ledger";
$result = $conn->query($sql_query);

if($result){
    if($result->num_rows > 0){
       // Start Table
       echo "<table border = '1'>
            <tr>
                 <th>10</th>
                 <th>Ledger Name</th>
            </tr>";
            
        // Output data of each row
        while ($row = $result->fetch_assoc()){
            echo "<tr>
                <td>". $row['id']."</td>
                <td>". $row['entity']."</td>
                </tr>";
            }
        // End Table
        echo "</table>";
    } else {
        echo "0 results";
    }
} else {
    echo "Query Failed: ".$conn->error;
}
$conn->close();