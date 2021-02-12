<?php   
   $my_file1 = fopen("file1.txt", "r");
   $my_file2 = fopen("file2.txt", "w");
   while(!feof($my_file1)){
       $txt = fgets($my_file1);
       fwrite($my_file2, $txt);
       echo $txt ."<br>";
   }
   fclose($my_file2);
   fclose($my_file1);
?> 




<form method = "POST">
CHOOSE THE FILE  :<input type = "file" value = "Choose a file" name = "filename">
<br><br>
<input value = "submit" type = "submit"><br>
</form>
<?php
$filename = $_POST["filename"];
if(isset($filename)){
	$myfile = fopen($filename , "r") or die("unable to open file");
	$myfile1 = fopen("text.txt","w") or die("Unable to open file");
	fwrite($myfile1,fread($myfile,filesize($filename)));
	fclose($myfile);
fclose($myfile1);
	echo "Contents of ".$filename. " have been written to 'test.txt'";
}
?>
