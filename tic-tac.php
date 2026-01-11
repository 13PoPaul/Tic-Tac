<?php
    
   $age = $_POST['age'];
   if ($age < 0)
   {
	    $TimeLeft = "Error please try again";
   } 
   $TimeLeft = 80 - $age;
?>
<html>
  <head>
    <title>Tic-Tac</title>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta name="generator" content="PyScripter">

	<link rel="stylesheet" type="text/css" href="02_style" />
  </head>
  <body>
	<p>
		We estimate your time left to live is : <?php echo $TimeLeft; ?> years
		<form action="index.php">
			<input class="" type="submit" value="Home">
		</form>
	</p>
  </body>
</html>