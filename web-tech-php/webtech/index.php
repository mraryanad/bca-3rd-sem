<?php
include './services/ledgerServices/fetchLedger.php';

// Start output buffering to capture content not found
ob_start();
?>

<form action="">
    <div class="row">
        <div class="col-lg-6">
            <label for="Ledger Name"></label>
            <input type="text" class="form-control">
        </div>
    </div>
</form>

<?php 
// Get the content and clean the output buffer
$content = ob_get_clean();

// Include the layout file with the content
include 'layout.php'
?>