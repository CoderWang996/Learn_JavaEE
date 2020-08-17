function setSidebarActive(th){
    $(th).parent("li").siblings().removeClass("active");
    $(th).parent("li").addClass("active");
}

function getCheckId() {
    //要么不选，要么选择至少一个
    var size = $("input:checkbox:checked").length;
    if(size==0) {
        return ;
    }else {
        let input = $('input[type=checkbox]:checked');
        let arr=new Array();
        for(let i=0;i<size;i++){
            arr.push(input[i].value);
        }
        return arr;
    }
}

function formSubmit (url,sTarget){
    document.forms[0].target = sTarget
    document.forms[0].action = url;
    document.forms[0].submit();
    return true;
}