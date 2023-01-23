$.get("xml/eventList.xml", function (xml, status) {
    var txt = "";
    $(xml).find("event").each(function () {
        var name = $(this).find("name").text();
        var desc = $(this).find("description").text();
        var date = $(this).find("date").text();
        var game = $(this).find("game").text();
        var participants = new Array();
        participants.push($(this).find("participants").text());
        //let arr = participants.split("#5%G7");

        let aux = participants[0];
        let aux2 = aux.split("#5%G7S1%3");

        // txt += "<b>Name:</b> " + name + "<br>" + "<b>Description:</b> " + desc + "<br>" + "<b>Date: </b>" + date + "<br>" + "<b>Game:</b> " + game + "<br>" + "<b>Participants:</b> " + participantsToText + "<br>";
        txt += " <div class='col-lg-6 mb-3'> <div class='card'> <div class='card-body'> <h3>" + name + "</h3> <h5>" + date + "</h5> <p class='mb-0'> " + desc + "</p> " + "<b>Participants:</b> ";
        aux2.forEach((participant) => txt += "<p>" + participant + "</p>");
        txt += "</div> </div> </div>";
        $("#eventCol").html(txt);

    });

    $("#events").html(txt);
});



$.get("xml/gameList.xml", function (xml, status) {
    var txt = "";
    let arr = [];
    $(xml).find("game").each(function () {
        let obj = {
            name: $(this).find("name").text(),
            desc: $(this).find("description").text(),
            maxPlayers: $(this).find("maxPlayers").text(),
            status: $(this).find("status").text(),
            image: $(this).find("urlImage").text(),
            rating: parseFloat($(this).find("rating").text())
        }

        arr.push(obj);
    });

    arr.sort((a, b) => b.rating - a.rating);
    txt += "<div class='row'>";
    arr.forEach((game) =>
        txt += "<div class='col-md-6'> <div class='card m-1'> <div class='image'> <img src='./saved-images/" + game.image + "'></img></div> <h2 class='text-center'>" + game.name + "</h2> <p class='ms-3'>Players: " + game.maxPlayers + "</p><p class='ms-3'>" + game.desc + "</p> <p class='ms-3'> Rating:  " + game.rating + "</p> <p class='ms-3'> " + game.status + "</p> </div> </div>"
    )
    $("#hra1").html(txt);
    txt+="</div>";
});


$.get("xml/reservationsList.xml", function (xml, status) {
    var txt = "";
    $(xml).find("reservation").each(function () {
        var start = $(this).find("start_date").text();
        var end = $(this).find("end_date").text();
        var member = $(this).find("member").text();
        var game = $(this).find("game").text();
        txt += "<b>Start date:</b> " + start + "<br>" + "<b>End date:</b> " + end + "<br>" + "<b>Member:</b> " + member + "<br>" + "<b class'mb-5'>Game: </b>" + game + "<br><br>";
    });
    $("#reservations").html(txt);
});

$.get("xml/borrowingsList.xml", function (xml, status) {
    var txt = "";
    $(xml).find("borrowing").each(function () {
        var start = $(this).find("start_date").text();
        var end = $(this).find("end_date").text();
        var member = $(this).find("member").text();
        var game = $(this).find("game").text();
        var location = $(this).find("location").text();
        txt += "<b>Start date: </b>" + start + "<br>" + "<b>End date:</b> " + end + "<br>" + "<b>Member:</b> " + member + "<br>" + "<b>Game:</b> " + game + "<br>" + "<b class'mb-5'>Location:</b> " + location + "<br><br>";
    });
    $("#borrowings").html(txt);
});