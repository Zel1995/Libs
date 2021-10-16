// Generated by view binder compiler. Do not edit!
package com.example.mvpproject.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.mvpproject.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentRegistrationBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextInputLayout loginRegLayout;

  @NonNull
  public final TextInputLayout nameRegLayout;

  @NonNull
  public final TextInputLayout passwordRegLayout;

  @NonNull
  public final MaterialButton regBtn;

  @NonNull
  public final TextInputEditText regLogin;

  @NonNull
  public final TextInputEditText regName;

  @NonNull
  public final TextInputEditText regPassword;

  private FragmentRegistrationBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextInputLayout loginRegLayout, @NonNull TextInputLayout nameRegLayout,
      @NonNull TextInputLayout passwordRegLayout, @NonNull MaterialButton regBtn,
      @NonNull TextInputEditText regLogin, @NonNull TextInputEditText regName,
      @NonNull TextInputEditText regPassword) {
    this.rootView = rootView;
    this.loginRegLayout = loginRegLayout;
    this.nameRegLayout = nameRegLayout;
    this.passwordRegLayout = passwordRegLayout;
    this.regBtn = regBtn;
    this.regLogin = regLogin;
    this.regName = regName;
    this.regPassword = regPassword;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentRegistrationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentRegistrationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_registration, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentRegistrationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.login_reg_layout;
      TextInputLayout loginRegLayout = rootView.findViewById(id);
      if (loginRegLayout == null) {
        break missingId;
      }

      id = R.id.name_reg_layout;
      TextInputLayout nameRegLayout = rootView.findViewById(id);
      if (nameRegLayout == null) {
        break missingId;
      }

      id = R.id.password_reg_layout;
      TextInputLayout passwordRegLayout = rootView.findViewById(id);
      if (passwordRegLayout == null) {
        break missingId;
      }

      id = R.id.reg_btn;
      MaterialButton regBtn = rootView.findViewById(id);
      if (regBtn == null) {
        break missingId;
      }

      id = R.id.reg_login;
      TextInputEditText regLogin = rootView.findViewById(id);
      if (regLogin == null) {
        break missingId;
      }

      id = R.id.reg_name;
      TextInputEditText regName = rootView.findViewById(id);
      if (regName == null) {
        break missingId;
      }

      id = R.id.reg_password;
      TextInputEditText regPassword = rootView.findViewById(id);
      if (regPassword == null) {
        break missingId;
      }

      return new FragmentRegistrationBinding((ConstraintLayout) rootView, loginRegLayout,
          nameRegLayout, passwordRegLayout, regBtn, regLogin, regName, regPassword);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}