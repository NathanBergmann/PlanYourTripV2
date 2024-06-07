(function(){
    $("#tabdestinos").on("click",".js-delete",function(){
        let botaoclicado = $(this)
        $("#btnsim").attr("data-id",botaoclicado.attr("data-id"))
        $("#modaldestino").modal("show")
    })
    $("#btnsim").on("click", function(){
        let botaosim = $(this)
        let id = botaosim.attr("data-id")

        $.ajax({
            url: "/destinos/delete/" + id,
            method: "GET",
            success: function(){
                window.location.href = "/destinos"
            }
        })
    })
})()