<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Murach's Java Servlets and JSP</title>
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>
</head>
<body>

    <h1>Downloads</h1>

    <h2>Khoi My</h2>

    <table>
        <tr>
            <th>Song title</th>
            <th>Audio Format</th>
        </tr>
        <tr>
            <td>Chuot Yeu Gao</td>
            <!--<td><a href="./musicStore/sound/${productCode}/Chuot-Yeu-Gao.mp3">MP3</a></td>-->
            <td>
                <div class="card-container">
                <div class="card-header">Chuot_Yeu_Gao</div>
                <div class="card-body">
                  <audio controls="">
                    <source type="audio/mpeg" src="./musicStore/sound/${productCode}/Chuot-Yeu-Gao.mp3">"
                  </audio>
                </div>
            </div>        
            </td>
        </tr>
        <tr>
            <td>Nguoi Yeu Cu</td>
            <!--<td><a href="./musicStore/sound/${productCode}/Nguoi_Yeu_Cu.mp3">MP3</a></td>-->
            <td>
                <div class="card-container">
                <div class="card-header">Nguoi_Yeu_Cu</div>
                <div class="card-body">
                  <audio controls="">
                    <source type="audio/mpeg" src="./musicStore/sound/${productCode}/Nguoi_Yeu_Cu.mp3">"
                  </audio>
                </div>
            </div>        
            </td>
        </tr>
    </table>

    <p><a href="?action=viewAlbums">View list of albums</a></p>

    <p><a href="?action=viewCookies">View all cookies</a></p>

</body>
</html>