<html>
<body style = "text-align:center;">
	<br><br><br>
<h3 ><b> PHP To Find The Prime Number</b></h3>
<form method = "POST">
	
	<br><br>Enter a Number between 1 to : <input type = "number" name = "num"><br>
	<br><input type = "submit" value = "Submit"><br><br><br><br>
</form>
</body>
</html>

<?php

function isPrime($n) {
	for($i = 2; $i < $n; $i++){
		if($n % $i == 0)
			return FALSE;
	}
	return TRUE;
  
}
$num = 0;
if (isset($_POST['num'])) {
    global $num;
    $num = $_POST['num'];
}
for($i = 1; $i <= $num; $i++) {
	if(isPrime($i))
		echo $i.", ";
}

?>
