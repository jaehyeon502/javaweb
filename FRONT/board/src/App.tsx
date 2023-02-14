import './App.css';
import AuthenticationView from './view/AuthenticationView';
import NavigationBar from './view/NavigationBar';
import { Routes, Route } from 'react-router-dom';

//# Router 설계
//? 1. 'main' path 작성 : '/'
//? 2. 'auth' path 작성 : '/auth'
//? 3. 'myPage' path 작성 : '/myPage'
//? 4. 'boardSearch' path 작성 : '/board/search/:content'
//? 5. 'boardDetail' path 작성 : '/board/detail/:boardNumber'
//? 6. 'boardWrite' path 작성 : '/board/write'
//? 7. 'boardUpdate' path 작성 : '/board/update/:boardNumber'
function App() {
  return (
    <>
      <NavigationBar />
      <Routes>
        <Route path='/' element={(<></>)} />
        <Route path='/auth' element={(<AuthenticationView />)} />
        <Route path='/myPage' element={(<></>)} />
        <Route path='/board'>
          <Route path='/write' element={(<></>)} />
          <Route path='/search/:content' element={(<></>)} />
          <Route path='/detail:boardNumber' element={(<></>)} />
          <Route path='/update/:boardNumber' element={(<></>)} />
        </Route>
      </Routes>
    </>
  );
}

export default App;
