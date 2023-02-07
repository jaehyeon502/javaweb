import { useState } from 'react'
import KakaoSignIn from './views/KakaoSignIn';
import NaverSignIn from './views/NaverSignIn'

import { Link } from "react-router-dom"

import './App.css'
import MenuAppBar from './components/MenuAppBar';

export default function App() {
    const [view, setView] = useState<string>("");
    return (
        <div>
            <MenuAppBar setView={setView} />
            
            <div>
                {/* {view === 'NaverSignIn' && (<NaverSignIn />)} */}
                {/* 
                //# 삼항 비교 연산자
                //? 조건에 따라서 참일떄의 겨롸값과 거짓일때의 결과값을 지정해서
                //? 해당하는 경우의 값을 반환
                //? 조건 ? 참일 때의 결과값 : 거짓일 때의 결과값
                */}
                {/* if(조건){} else {if(조건) {} else {} } */}
                {/* 
                //^ <></> : 아무런 의미가 없는 빈태그
                */}
                {view}
                {   view === 'NaverSignIn' ? (<NaverSignIn />) :
                    view === 'KakaoSignIn' ? (<KakaoSignIn />) : (<></>)}
            </div>
        </div>
    )
}
