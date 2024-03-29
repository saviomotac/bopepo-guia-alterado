/*
 * Copyright 2008 JRimum Project
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by
 * applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS
 * OF ANY KIND, either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 * 
 * Created at: 30/03/2008 - 18:59:24
 * 
 * ================================================================================
 * 
 * Direitos autorais 2008 JRimum Project
 * 
 * Licenciado sob a Licença Apache, Versão 2.0 ("LICENÇA"); você não pode usar
 * esse arquivo exceto em conformidade com a esta LICENÇA. Você pode obter uma
 * cópia desta LICENÇA em http://www.apache.org/licenses/LICENSE-2.0 A menos que
 * haja exigência legal ou acordo por escrito, a distribuição de software sob
 * esta LICENÇA se dará “COMO ESTÁ”, SEM GARANTIAS OU CONDIÇÕES DE QUALQUER
 * TIPO, sejam expressas ou tácitas. Veja a LICENÇA para a redação específica a
 * reger permissões e limitações sob esta LICENÇA.
 * 
 * Criado em: 30/03/2008 - 18:59:24
 * 
 */


package br.com.jrimum.domkee.comum.pessoa;

import java.io.Serializable;
import java.util.Collection;

import br.com.jrimum.domkee.comum.pessoa.contato.NumeroDeTelefone;
import br.com.jrimum.domkee.comum.pessoa.endereco.Endereco;
import br.com.jrimum.domkee.comum.pessoa.id.cprf.AbstractCPRF;
import br.com.jrimum.domkee.financeiro.banco.febraban.ContaBancaria;

/**
 * 
 * @author <a href="http://gilmatryx.googlepages.com">Gilmar P.S.L.</a>
 * @author Misael
 * @author Romulo
 * 
 * @see br.com.jrimum.domkee.financeiro.banco.Pessoa
 * 
 * @since 0.2
 * 
 * @version 0.2
 */
public interface Pessoa extends Serializable {

	public String getNome();

	public void setNome(String nome);

	public AbstractCPRF getCPRF();

	public void setCPRF(AbstractCPRF cprf);

	public Collection<NumeroDeTelefone> getTelefones();

	public void setTelefones(Collection<NumeroDeTelefone> telefones);

	public void addTelefone(NumeroDeTelefone telefone);

	public Collection<Endereco> getEnderecos();

	public void setEnderecos(Collection<Endereco> enderecos);

	public void addEndereco(Endereco endereco);

	public Collection<ContaBancaria> getContasBancarias();

	public void setContasBancarias(Collection<ContaBancaria> contasBancarias);

	public void addContaBancaria(ContaBancaria contaBancaria);

	public boolean isFisica();

	public boolean isJuridica();
	
	public boolean hasContaBancaria();
}
