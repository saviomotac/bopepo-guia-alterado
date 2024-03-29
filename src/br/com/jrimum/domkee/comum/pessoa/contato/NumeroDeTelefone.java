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
 * Created at: 30/03/2008 - 19:10:26
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
 * Criado em: 30/03/2008 - 19:10:26
 * 
 */

package br.com.jrimum.domkee.comum.pessoa.contato;

import java.io.Serializable;

import br.com.jrimum.utilix.ObjectUtil;

/**
 * 
 * <p>
 * Representação particio
 * </p>
 * 
 * @author <a href="http://gilmatryx.googlepages.com">Gilmar P.S.L.</a>
 * @author Misael
 * @author Romulo
 * @author Samuel
 * 
 * @since 0.2
 * 
 * @version 0.2
 */
public class NumeroDeTelefone implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8948441953189653213L;

	private int ddi;

	private int ddd;

	private int prefixo;

	private int sufixo;
	
	private String telefone;

	public NumeroDeTelefone() {}
	
	public int getDDI() {
		return ddi;
	}

	public void setDDI(int ddi) {
		this.ddi = ddi;
	}

	public int getDDD() {
		return ddd;
	}

	public void setDDD(int ddd) {
		this.ddd = ddd;
	}

	public int getPrefixo() {
		return prefixo;
	}

	public void setPrefixo(int prefixo) {
		this.prefixo = prefixo;
	}

	public int getSufixo() {
		return sufixo;
	}

	public void setSufixo(int sufixo) {
		this.sufixo = sufixo;
	}
	
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return ObjectUtil.toString(this);
	}
}
