
function hello() {

    var userName = document.getElementById("user_name").value;

    $.ajax({
        type: "GET",
        url: "http://localhost:8080/greetings?name=" + userName

    }).then(function (data, status, jqxhr) {

        //$('.greeting-id').append(data.id);
        //$('.greeting-content').append(data.content); //changed

        document.getElementById("id").innerHTML = data.id;
        document.getElementById("response").innerHTML = data.content;

        console.log(data);

    });

}

   

