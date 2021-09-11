import React, { Component } from "react";
import Login from "./Login";
import { observer } from "mobx-react";

@observer
class App extends Component {
  render() {
    var loginShown = {
      display: !this.props.statusStore.login ? "block" : "none",
    };
    var topShown = {
      display: this.props.statusStore.login ? "block" : "none",
    };
    return (
      <div>
        <div style={loginShown}>
          <Login />
        </div>
        <div style={topShown}>ログインに成功しました！！！</div>
      </div>
    );
  }
}

export default App;
