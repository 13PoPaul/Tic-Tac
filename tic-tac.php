<?php
    
   $age = $_POST['age'];
   if ($age < 0)
   {
	    $TimeLeft = "Error please try again";
   }
   else $TimeLeft = 80 - $age;
   
?>
<html>
  <head>
    <title>Tic-Tac</title>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta name="generator" content="PyScripter">

	<link rel="stylesheet" type="text/css" href="tic-tac.css" />
  </head>
  <body>
	<p>
		We estimate your time left to live is : <?php echo $TimeLeft; ?> years<br>
    Every black block is a year of your life !
  <?php
    for ($i = 0; $i < $age; $i++)
    {
        echo '<span class="BBlock"></span>';
    }
    for ($j = $age; $j < 80; $j++)
    {
        echo '<span class="WBlock"></span>';
    }
  ?>
		<form action="index.php">
			<input class="" type="submit" value="Home">
		</form>
	</p>
  </body>
</html>