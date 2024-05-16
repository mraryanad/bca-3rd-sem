<?php
// database connection parameters
$hostname = 'localhost';
$username = 'root';
$password = '';
$database = 'debit_credit_tracker';

// Create connection
$conn = new mysqli($hostname, $username, $password, $database);

// Check connection
if ($conn->connect_error) {
    die("Connection Error: " . $conn->connect_error);
} else {
    echo "Connected Successfully <br/>";
}

// If the form is submitted
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // Get the entity value from the form
    $entity = $_POST["entity"];

    // Insert the new entity into the ledger table
    $sql_insert = "INSERT INTO ledger (entity) VALUES ('$entity')";
    if ($conn->query($sql_insert) === TRUE) {
        echo "New ledger created successfully";
    } else {
        echo "Error: " . $sql_insert . "<br>" . $conn->error;
    }
}
?>

<!-- Form to enter a new entity -->
<form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>">
    Enter Ledger Name: <input style="display: block; margin-bottom: 10px;" type="text" name="entity" required>
    <input type="submit" name="submit" value="Submit">
</form>

<?php
// Fetch data from the ledger table
$sql_query = "SELECT * FROM ledger";
$result = $conn->query($sql_query);

if ($result) {
    if ($result->num_rows > 0) {
        // Start Table
        echo "<table border='1'>
            <tr>
                <th>ID</th>
                <th>Entity</th>
                <th>Action</th>
            </tr>";

        // Output data of each row
        while ($row = $result->fetch_assoc()) {
            echo "<tr>
                <td>" . $row['id'] . "</td>
                <td>" . $row['entity'] . "</td>
                <td><button>Edit</button></td>
            </tr>";
        }
        // End Table
        echo "</table>";
    } else {
        echo "0 results";
    }
} else {
    echo "Query Failed: " . $conn->error;
}
$conn->close();
?>