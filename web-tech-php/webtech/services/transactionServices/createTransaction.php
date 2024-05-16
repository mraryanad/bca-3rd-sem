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
    die("Connection Error".
    $conn->connect_error);
} else {
    echo "Connected Successful </br>";
}

// Fetch Data
$sql_query = "SELECT * FROM transaction";
$result = $conn->query($sql_query);

if($result){
    if($result->num_rows>0){
        // Start Table
        echo "<table border = '1'>
            <tr>
                <th>id</th>
                <th>is_debit_or_credit</th>
                <th>amount</th>
                <th>ledger_id</th>
            </tr>";

            // Output Data of each row
            while($row = $result-> fetch_assoc()) {
                echo "<tr>
                    <td>".$row['id']."</td>
                    <td>".$row['is_debit_or_credit']."</td>
                    <td>".$row['amount']."</td>
                    <td>".$row['ledger_id']."</td>
                </tr>";
            }
            
            // End Table
        echo "</table>";
        
    }else {
        echo "0 results";
        
    }       
} else {
        echo "Query Failed: ".$conn->error;
        
}
$conn->close();
?>