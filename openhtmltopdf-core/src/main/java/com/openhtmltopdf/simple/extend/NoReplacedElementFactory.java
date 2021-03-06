package com.openhtmltopdf.simple.extend;

import com.openhtmltopdf.extend.ReplacedElement;
import com.openhtmltopdf.extend.ReplacedElementFactory;
import com.openhtmltopdf.extend.UserAgentCallback;
import com.openhtmltopdf.layout.LayoutContext;
import com.openhtmltopdf.render.BlockBox;

public class NoReplacedElementFactory implements ReplacedElementFactory {
	@Override
    public ReplacedElement createReplacedElement(LayoutContext c, BlockBox box,
            UserAgentCallback uac, int cssWidth, int cssHeight) {
        return null;
    }
	
	@Override
	public boolean isReplacedElement(BlockBox box) {
		return false;
	}
}
