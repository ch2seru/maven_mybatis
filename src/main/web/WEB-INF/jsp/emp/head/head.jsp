<script>
    window.onload = function(){
        //alert('aaa');
        //save();
    }
    function save(){
        document.saveForm.action="/save.do";
        document.saveForm.submit();
    }

    function modify(){
        document.saveForm.action="/modify.do";
        document.saveForm.submit();
    }
</script>

