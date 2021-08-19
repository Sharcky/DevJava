// Call the dataTables jQuery plugin
$(document).ready(function() {

       loadUsers();
      $('#dataTable').DataTable();
});


async function loadUsers() {
  const request = await fetch('api/users', {
    method: 'GET',
    headers: getHeaders()
  });
  const users = await request.json();


  let listHtml = '';
  for (let user of users) {
    let buttDelete = '<a href="#" onclick="eliminarUsuario(' + user.id + ')" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a>';

    let telefonoTexto = usuario.telefono == null ? '-' : usuario.telefono;
    let usuarioHtml = '<tr><td>'+usuario.id+'</td><td>' + usuario.nombre + ' ' + usuario.apellido + '</td><td>'
                    + usuario.email+'</td><td>'+telefonoTexto
                    + '</td><td>' + botonEliminar + '</td></tr>';
    listadoHtml += usuarioHtml;
  }

document.querySelector('#usuarios tbody').outerHTML = listadoHtml;

}
