<?php
include "./services/transactionServices/readSingleTransaction.php";
ob_start();
?>

<form
    action="./services/transactionServices/updateTransaction.php<?php echo isset($transaction_id) ? '?transaction_id='.$transaction_id:'';?>"
    method="post">
    <label style="display: block;" for="">Transaction Name </label>
    <input style="display: block; margin-bottom: 10px;" type="text" name="entity"
        value="<?php echo ($transaction['entity']) ?>">
    <button class="btn btn-success" type="submit">Submit</button>
</form>

<?php
 $content = ob_get_clean();
include 'layout.php';
?>