package com.example.mvpproject.ui.login;

import java.lang.Override;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.SkipStrategy;

public class LoginContract$View$$State extends MvpViewState<LoginContract.View> implements LoginContract.View {
	@Override
	public void setState(LoginContract.ViewBehavior state) {
		SetStateCommand setStateCommand = new SetStateCommand(state);
		this.viewCommands.beforeApply(setStateCommand);

		if (hasNotView()) {
			return;
		}

		for (LoginContract.View view : this.views) {
			view.setState(state);
		}

		this.viewCommands.afterApply(setStateCommand);
	}

	@Override
	public void setAuthError(LoginContract.Error error) {
		SetAuthErrorCommand setAuthErrorCommand = new SetAuthErrorCommand(error);
		this.viewCommands.beforeApply(setAuthErrorCommand);

		if (hasNotView()) {
			return;
		}

		for (LoginContract.View view : this.views) {
			view.setAuthError(error);
		}

		this.viewCommands.afterApply(setAuthErrorCommand);
	}

	public class SetStateCommand extends ViewCommand<LoginContract.View> {
		public final LoginContract.ViewBehavior state;

		SetStateCommand(LoginContract.ViewBehavior state) {
			super("setState", SkipStrategy.class);

			this.state = state;
		}

		@Override
		public void apply(LoginContract.View mvpView) {
			mvpView.setState(state);
		}
	}

	public class SetAuthErrorCommand extends ViewCommand<LoginContract.View> {
		public final LoginContract.Error error;

		SetAuthErrorCommand(LoginContract.Error error) {
			super("setAuthError", SkipStrategy.class);

			this.error = error;
		}

		@Override
		public void apply(LoginContract.View mvpView) {
			mvpView.setAuthError(error);
		}
	}
}
