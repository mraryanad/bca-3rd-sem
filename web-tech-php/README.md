# Process of running this code

`FOR WINDOWS`

- Download and install <b>XAMPP</b>
- Run the <b>mySQL</b> and <b>Apache</b> server
- Go to <b>localhost/phpmyadmin</b> and create a DB named `debit_credit_tracker`
- Create a table named `ledger` with 2 rows: <i><b>id</b></i> and <i><b>entity</b></i>
  </br></br>`Configuration For ledger:`</br>

  - Assign <u>BIGINT</u> to <i><b>id</b></i> and Auto Increment it.
  - Assign <u>VARCHAR</u> of length <u>255</u> to <i><b>entity</b></i>

- Create a table named `transaction` with 4 rows: <i><b>id</b></i>, <i><b>is_credit_or_debit</b></i>, <i><b>amount</b></i> and <i><b>ledger_id</b></b></i>
  </br></br>`Configuration For transaction:`</br>

  - Assign <u>BIGINT</u> to <i><b>id</b></i> and Auto Increment it.
  - Assign <u>ENUM</u> to <i><b>is_credit_or_debit</b></i> with values <u>CR</u> and <u>DR</u>
  - Assign <u>FLOAT</u> to <i><b>amount</b></i>
  - Link <i><b>id</b></i> from the `ledger` table to <i><b>ledger_id</b></i>
    </br>
    `Go to transaction>structure and configure it in a similar way:`
    <img src = "./Assets/image.png"/>

  </hr>
  </br>
  Follow the same steps for linux, except the installation process. The installation process for linux is shown below.
