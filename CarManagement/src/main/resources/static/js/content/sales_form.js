function insert(){
    a = document.querySelector('.salesName').value;
    b = document.querySelector('.salesTel').value;

    if (a == '' || b == ''){
        alert('값을 입력해주세요.')
    }
    else{
        const submitInfo = document.querySelector('#salesOne');
        submitInfo.submit();
    }
    
}
