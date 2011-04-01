package com.ceptrader.tradeapp.ib.esper.events;

import com.ceptrader.tradeapp.datastream.DataItem;
import com.ceptrader.tradeapp.util.BasicUtils;

public class FundamentalData implements DataItem {
	private static final long	serialVersionUID	= 1L;
	private String	          data;
	private int	              reqId;
	
	@Deprecated
	public FundamentalData() {
	}
	
	public FundamentalData(final int reqId, final String data) {
		this.reqId = reqId;
		this.data = data;
	}
	
	public String getData() {
		return data;
	}
	
	public int getReqId() {
		return reqId;
	}
	
	public void setData(final String data) {
		this.data = data;
	}
	
	public void setReqId(final int reqId) {
		this.reqId = reqId;
	}
	
	@Override
	public String toString() {
		return BasicUtils.toString(this);
	}
}
