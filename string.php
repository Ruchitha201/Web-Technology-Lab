<br><br><br> 
<form action="">
    Enter string: <input type="text" name="string"><br><br>
    Enter a sub-string to find in main string: <input type="text" name="sub"><br><br> 
    <input type="submit"><br>
</form>
<?php
echo "Length of String: ";
echo strlen($_GET["string"])."<br><br>";
echo "Word Count of String: ";
echo str_word_count($_GET["string"])."<br><br>";
echo "Reverse of a String: ";
echo strrev($_GET["string"])."<br><br>";
$string = $_GET["string"];
$sub = $_GET["sub"];
echo "Finding for specific String in main String: ";
if(strpos($string,$sub) !== false) {
    echo "The string '" .$string. "' contains '" .$sub. "'.";
} 
else {
    echo "The string '" .$string. "' does not contains '" .$sub. "'.";
}
?>
?>
