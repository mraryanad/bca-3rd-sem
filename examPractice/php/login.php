<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <h1>LOGIN TO PROCEED</h1>
    <?php

    $valid_username = "user";
    $valid_password = "password";

    if($_SERVER["REQUEST_METHOD"] == "POST"){
        $username = $_POST["username"];
        $password = $_POST["password"];

        if($username === $valid_username && $password === $valid_password){
            header("Location: home.php");
            exit();
        }else{
            echo "<p style='color: red; font-weight: 800;'>Invalid username or password. Try Again!!!</p>";
        }
    }
    ?>

    <form action="<?php echo htmlspecialchars($_SERVER['PHP_SELF']);?>" method="POST">
        <label for="username">Username</label>
        <input type="text" name="username" id="username">

        <br><br>

        <label for="password">Password</label>
        <input type="password" name="password" id="password">

        <button type="submit">Login</button>
    </form>
</body>

</html>