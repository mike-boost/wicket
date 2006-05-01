/*
 * $Id: org.eclipse.jdt.ui.prefs 5004 2006-03-17 20:47:08 -0800 (Fri, 17 Mar
 * 2006) eelco12 $ $Revision: 5004 $ $Date: 2006-03-17 20:47:08 -0800 (Fri, 17
 * Mar 2006) $
 * 
 * ==============================================================================
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package wicket.markup.html.form;

import wicket.markup.html.WebPage;
import wicket.markup.html.form.Form;
import wicket.markup.html.form.Radio;
import wicket.markup.html.form.RadioGroup;

/**
 * Test page for checking markup of radiogroups.
 * 
 * @author Martijn Dashorst
 */
public class RadioGroupTestPage3 extends WebPage
{
	/** For serialization. */
	private static final long serialVersionUID = 1L;

	/**
	 * Construct.
	 */
	public RadioGroupTestPage3()
	{
		Form form = new Form("form");
		RadioGroup radio = new RadioGroup("radio");
		radio.add(new Radio("check1"));
		radio.add(new Radio("check2"));
		form.add(radio);
		add(form);
	}
}
