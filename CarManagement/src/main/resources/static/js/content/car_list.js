function insertCar(){
    const carName = document.querySelector('.carName').value;
    const carPrice = document.querySelector('.carPrice').value.toString();

    if (carName == '' || carPrice == ''){
        alert('값을 입력해주세요.')
    }
    else{
        const submitInfo = document.querySelector('#carOne');
        submitInfo.submit();
    }
    
}
