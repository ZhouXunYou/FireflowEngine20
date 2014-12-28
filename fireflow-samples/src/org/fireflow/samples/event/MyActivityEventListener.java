package org.fireflow.samples.event;

import org.fireflow.engine.entity.runtime.ActivityInstance;
import org.fireflow.engine.modules.instancemanager.event.AbsActivityInstanceEventListener;
import org.fireflow.engine.modules.instancemanager.event.ActivityInstanceEvent;
import org.fireflow.pdl.fpdl20.process.Activity;

public class MyActivityEventListener extends AbsActivityInstanceEventListener {

	/**
	 * Activity�������������߱�Abort���ᴥ���÷���
	 */
	@Override
	protected void afterActivityInstanceEnd(ActivityInstanceEvent e) {
		ActivityInstance actInst = e.getSource();
		Activity activity = (Activity)e.getWorkflowElement();
		System.out.println("--�����¼�MyActivityEventListener.afterActivityInstanceEnd(...)");
		System.out.println("----�����¼��Ļʵ���ǣ�id="+actInst.getId()+";displayName="+
				actInst.getDisplayName()+"; state="+actInst.getState().getDisplayName()+
				";�ʵ���Ĺ����־="+actInst.isSuspended());
		System.out.println("----��ʵ����Ӧ�Ļ�ڵ��ǣ�id="+activity.getId());
		System.out.println("------------------------------------");

		super.afterActivityInstanceEnd(e);
	}

	@Override
	protected void onActivityInstanceCreated(ActivityInstanceEvent e) {
		ActivityInstance actInst = e.getSource();
		Activity activity = (Activity)e.getWorkflowElement();
		System.out.println("--�����¼�MyActivityEventListener.onActivityInstanceCreated(...)");
		System.out.println("----�����¼��Ļʵ���ǣ�id="+actInst.getId()+";displayName="+
				actInst.getDisplayName()+"; state="+actInst.getState().getDisplayName()+
				";�ʵ���Ĺ����־="+actInst.isSuspended());
		System.out.println("----��ʵ����Ӧ�Ļ�ڵ��ǣ�id="+activity.getId());
		System.out.println("------------------------------------");

		super.onActivityInstanceCreated(e);
	}

	@Override
	protected void onActivityInstanceRestored(ActivityInstanceEvent e) {
		ActivityInstance actInst = e.getSource();
		Activity activity = (Activity)e.getWorkflowElement();
		System.out.println("--�����¼�MyActivityEventListener.onActivityInstanceRestored(...)");
		System.out.println("----�����¼��Ļʵ���ǣ�id="+actInst.getId()+";displayName="+
				actInst.getDisplayName()+"; state="+actInst.getState().getDisplayName()+
				";�ʵ���Ĺ����־="+actInst.isSuspended());
		System.out.println("----��ʵ����Ӧ�Ļ�ڵ��ǣ�id="+activity.getId());
		System.out.println("------------------------------------");

		super.onActivityInstanceRestored(e);
	}

	@Override
	protected void onActivityInstanceSuspended(ActivityInstanceEvent e) {
		ActivityInstance actInst = e.getSource();
		Activity activity = (Activity)e.getWorkflowElement();
		System.out.println("--�����¼�MyActivityEventListener.onActivityInstanceSuspended(...)");
		System.out.println("----�����¼��Ļʵ���ǣ�id="+actInst.getId()+";displayName="+
				actInst.getDisplayName()+"; state="+actInst.getState().getDisplayName()+
				";�ʵ���Ĺ����־="+actInst.isSuspended());
		System.out.println("----��ʵ����Ӧ�Ļ�ڵ��ǣ�id="+activity.getId());
		System.out.println("------------------------------------");

		super.onActivityInstanceSuspended(e);
	}

}
