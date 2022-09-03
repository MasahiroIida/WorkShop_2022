import { observable } from "mobx";

class StatusStore {
  @observable userId = "";
  @observable login = false;
}

var store = (window.statusStore = new StatusStore());

export default store;
