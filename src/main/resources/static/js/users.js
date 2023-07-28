// Call the dataTables jQuery plugin
$(document).ready(function() {
  loadUsers();
  $('#users').DataTable();
});

async function loadUsers(){

    const request = await fetch('api/users', {
        method: 'GET',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        }
    });
    const users = await request.json();

    console.log(users);


    let listHTML = '';
    for(let user of users){

        let deleteBtn = '<a href="#" onclick="deleteUser('+ user.id +')" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a>';


        let userHtml = '<tr> <td>'+user.id+'</td> <td>'+user.name+' '+ user.lastName +'</td><td>'+user.email+'</td><td>'+user.phone+'</td><td>'+ deleteBtn +'</td></tr>';
        listHTML += userHtml;
    }


    document.querySelector('#users tbody').outerHTML = listHTML;
}

async function deleteUser(id){

        if(!confirm('Are you sure?')){
            return;
        }

        const request = await fetch('api/users/' + id, {
                method: 'DELETE',
                headers: {
                    'Accept': 'application/json',
                    'Content-Type': 'application/json'
                }
            });

            location.reload();

    }