package com.atguigu.responsibilitychain_22;

/**
 * Handler : 抽象的处理者, 定义了一个处理请求的接口, 同时包含另外 Handler
 */
public abstract class Approver {

	/**
	 * 下一个处理者
	 */
	Approver approver;
	/**
	 * 名字
	 */
	String name;

	public Approver(String name) {
		this.name = name;
	}

	//下一个处理者
	public void setApprover(Approver approver) {
		this.approver = approver;
	}

	//处理审批请求的方法，得到一个请求, 处理是子类完成，因此该方法做成抽象
	public abstract void processRequest(PurchaseRequest purchaseRequest);

}
