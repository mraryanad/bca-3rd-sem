<?php
include "./services/transactionServices/fetchTransaction.php";
ob_start();
?>

<h5 class="mt-5">All Transaction list</h5>
<table class="table mt-2" border="1">
    <thead>
        <tr>
            <th scope="col">SN</th>
            <th scope="col">DR/CR</th>
            <th scope="col">Amount</th>
            <th scope="col">Ledger ID</th>
            <th scope="col">Action</th>
        </tr>
    </thead>

    <tbody>
        <?php
	foreach($transaction_data as $row){
		echo "<tr>";
		echo "<th scope='row'>".$row['id']."</th>";
		echo "<td>".$row['is_debit_or_credit']."</td>";
		echo "<td>".$row['amount']."</td>";
		echo "<td>".$row['ledger_id']."</td>";
        echo "<td><button type='button' class='btn btn-primary'>Edit</button></td>";
		echo "</tr>";
	}
	?>
    </tbody>
</table>

<?php
 $content = ob_get_clean();
include 'layout.php';
?>