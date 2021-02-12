<html>
<body>
        <form method="POST">
            Enter first array of integers: <input type="array" name = "arr1[]"><br>
            Enter second array of integers: <input type="array" name = "arr2[]"><br>
            <input value="submit" type="submit">
        </form>
    </body>
</html>

<?php
    $arr1 = $_POST["arr1"][0];
    $arr2 = $_POST["arr2"][0];
    if(isset($arr1) && isset($arr2)){
        $arr = array_merge(explode(' ', $arr1), explode(' ', $arr2));
        sort($arr);
        echo nl2br("The merged and sorted array is \n");
        $l = sizeof($arr);
        for($i = 0; $i < $l; $i++){
            echo $arr[$i]." ";
        }
    }
?>
