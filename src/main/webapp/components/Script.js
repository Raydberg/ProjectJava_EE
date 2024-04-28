fetch('https://api.escuelajs.co/api/v1/products')
.then(response => response.json())
.then(data => {
    const productsBody = document.getElementById('productsBody');
    data.forEach(product => {
        const productRow = document.createElement('tr');
        [product.id, product.title, product.price, product.category.name].forEach(text => {
            const cell = document.createElement('td');
            cell.textContent = text;
            productRow.appendChild(cell);
        });
        productsBody.appendChild(productRow);
    });
})
.catch(error => console.error('Error:', error));


