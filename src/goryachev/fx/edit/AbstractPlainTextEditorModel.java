// Copyright © 2016-2017 Andy Goryachev <andy@goryachev.com>
package goryachev.fx.edit;
import javafx.scene.layout.Region;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;


/**
 * Plain Text FxEditor Model Base Class.
 */
public abstract class AbstractPlainTextEditorModel
	extends FxEditorModel
{
	public AbstractPlainTextEditorModel()
	{
	}
	
	
	public LineBox getDecoratedLine(int line)
	{
		LineBox b = new LineBox();
		String s = getPlainText(line);
		if(s != null)
		{
			Text tx = new Text(s);
			b.addText(tx);
		}
		return b;
	}
}