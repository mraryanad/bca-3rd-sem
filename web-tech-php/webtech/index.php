<?php
include "./services/ledgerServices/fetchLedger.php";
ob_start();
?>

<h5 class="mt-5">All ledger list</h5>
<table class="table mt-2" border="1">
    <thead>
        <tr>
            <th scope="col">SN</th>
            <th scope="col">Ledger name</th>
            <th scope="col">Action</th>
        </tr>
    </thead>

    <tbody>
        <?php
	foreach($ledger_data as $row){
		echo "<tr>";
		echo "<th scope='row'>".$row['id']."</th>";
		echo "<td>".$row['entity']."</td>";
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