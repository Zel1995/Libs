package com.example.mvpproject.ui.registration;

import java.lang.Override;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.SkipStrategy;

public class RegistrationContract$View$$State extends MvpViewState<RegistrationContract.View> implements RegistrationContract.View {
	@Override
	public void setError() {
		SetErrorCommand setErrorCommand = new SetErrorCommand();
		this.viewCommands.beforeApply(setErrorCommand);

		if (hasNotView()) {
			return;
		}

		for (RegistrationContract.View view : this.views) {
			view.setError();
		}

		this.viewCommands.afterApply(setErrorCommand);
	}

	@Override
	public void completeRegistration(long userId) {
		CompleteRegistrationCommand completeRegistrationCommand = new CompleteRegistrationCommand(userId);
		this.viewCommands.beforeApply(completeRegistrationCommand);

		if (hasNotView()) {
			return;
		}

		for (RegistrationContract.View view : this.views) {
			view.completeRegistration(userId);
		}

		this.viewCommands.afterApply(completeRegistrationCommand);
	}

	public class SetErrorCommand extends ViewCommand<RegistrationContract.View> {
		SetErrorCommand() {
			super("setError", SkipStrategy.class);
		}

		@Override
		public void apply(RegistrationContract.View mvpView) {
			mvpView.setError();
		}
	}

	public class CompleteRegistrationCommand extends ViewCommand<RegistrationContract.View> {
		public final long userId;

		CompleteRegistrationCommand(long userId) {
			super("completeRegistration", SkipStrategy.class);

			this.userId = userId;
		}

		@Override
		public void apply(RegistrationContract.View mvpView) {
			mvpView.completeRegistration(userId);
		}
	}
}
