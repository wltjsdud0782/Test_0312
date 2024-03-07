function insert(){
    const salesName = document.querySelector('.salesName').value;
    const salesTel = document.querySelector('.salesTel').value;

    if (salesName == '' || salesTel == ''){
        alert('값을 입력해주세요.')
    }
    else{
        const submitInfo = document.querySelector('#salesOne');
        submitInfo.submit();
    }
    
}
