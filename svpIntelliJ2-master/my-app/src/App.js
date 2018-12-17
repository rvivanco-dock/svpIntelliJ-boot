import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import Dashboard from "./components/Dashboard";

import Header from "./components/Layout/Header";
import "bootstrap/dist/css/bootstrap.min.css";
import {BrowserRouter as Router, Route} from "react-router-dom";

class App extends Component {
  render() {
    return (
        <Router>
          <div class="App">

              <Header/>
              <Route exact path="dashboard" component={Dashboard} />

          </div>
        </Router>
    );
  }
}

export default App;
