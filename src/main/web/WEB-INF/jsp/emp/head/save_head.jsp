<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="/common/aloha/css/aloha.css" type="text/css">
<script src="/common/aloha/lib/aloha.js" data-aloha-plugins="common/format,
common/list,
common/link,
common/highlighteditables"></script>
<script type="text/javascript">
    Aloha.ready( function() {
        // Make #content editable once Aloha is loaded and ready.
        Aloha.jQuery('#content').aloha();
    });
</script>
<script>
    function save(){
        document.getElementById("content").value=document.getElementById("content-aloha").innerHTML;
        document.saveForm.action="/save";
        document.saveForm.submit();
    }

    function modify(){
        document.getElementById("content").value=document.getElementById("content-aloha").innerHTML;
        document.saveForm.action="/modify";
        document.saveForm.submit();
    }
</script>
