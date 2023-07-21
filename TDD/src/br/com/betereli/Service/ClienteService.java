package br.com.betereli.Service;

import br.com.betereli.dao.ClienteDao;
import br.com.betereli.dao.ClienteDaoMock;
import br.com.betereli.dao.IClienteDao;

public class ClienteService {

    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao){
      // clienteDao = new ClienteDao();
       // clienteDao = new ClienteDaoMock();
        this.clienteDao = clienteDao;

    }
    public String salvar() {
        clienteDao.salvar();
        return "Sucesso";
    }


}
