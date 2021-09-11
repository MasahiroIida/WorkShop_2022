import React, { Component } from "react";
import "./Login.css";
import TextField from "@material-ui/core/TextField";
import Button from "@material-ui/core/Button";
import URL_PREFIX from "./import";

export default class Login extends Component {
  constructor() {
    super();
    this.state = {
      userId: "",
      password: "",
      administrator: false,
      message: "",
    };
  }

  login() {
    fetch(URL_PREFIX + "/login", {
      method: "post",
      body: "userid=" + this.state.userId + "&password=" + this.state.password,
      headers: new Headers({
        "Content-Type": "application/x-www-form-urlencoded",
      }),
    }).then(
      (result) => {
        if (result.status === 401) {
          this.setState({
            message:
              "ログインに失敗しました。社員番号あるいはパスワードが誤っています。",
          });
        } else {
          window.statusStore.userId = this.state.userId;
          window.statusStore.administrator = this.state.administrator;
          window.statusStore.login = true;
          this.setState({
            message: "",
          });
        }
      },
      (error) => {
        this.setState({
          message: "システムエラー。時間を空けてお試しください。",
        });
      }
    );
  }

  handleChangeUserId(event) {
    this.setState({
      userId: event.target.value,
    });
  }

  handleChangePassword(event) {
    this.setState({
      password: event.target.value,
    });
  }

  render() {
    return (
      <div>
        <div className="header">
          <h2>デモ用ログイン画面</h2>
        </div>
        <br />
        <br />
        <div className="textfield">
          <TextField
            id="userid"
            label="社員番号を入力"
            helperText="Required"
            onChange={(e) => this.handleChangeUserId(e)}
          />
        </div>
        <div className="textfield">
          <TextField
            id="password"
            type="password"
            label="パスワードを入力"
            helperText="Required"
            onChange={(e) => this.handleChangePassword(e)}
          />
        </div>
        <br />
        <br />
        <div>
          <Button variant="outlined" onClick={() => this.login()}>
            ログイン
          </Button>
        </div>
        <br />
        <div className="errormessage">{this.state.message}</div>
      </div>
    );
  }
}
