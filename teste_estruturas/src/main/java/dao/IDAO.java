package dao;

import Dominio.EntidadeDominio;
import java.util.List;
        
public interface IDAO {
 	public void Inserir(EntidadeDominio entidade);
	public void Alterar(EntidadeDominio entidade);
	public void Excluir(EntidadeDominio entidade);
	public List<EntidadeDominio> Consultar(EntidadeDominio entidade);
}
   
