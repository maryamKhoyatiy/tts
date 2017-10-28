<?php
// Set header Content Type
// Read from post and put it in array
$info=["user"=>htmlspecialchars($_POST["user"]),"pass"=>htmlspecialchars($_POST["pass"])];
// Check user info
if($info["user"]=="test"&&$info["pass"]=="654321"){
    echo json_encode(["result"=>"seccuess"]);
}
else{
    echo json_encode(["result"=>"failure"]);
}