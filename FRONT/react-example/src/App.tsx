import { useState } from 'react'
import KakaoSignIn from './views/KakaoSignIn';
import NaverSignIn from './views/NaverSignIn'

import './App.css'
import MenuAppBar from './components/MenuAppBar';
import Es6TypeScript from './views/Es6TypeScript';
import JsxTsx from './views/JsxTsx';
import { VIEW } from './enums';
import Hook from './views/Hook';
import Mui from './views/Mui';

export default function App() {
    const [view, setView] = useState<VIEW>(VIEW.NAVER);
    return (
        <div>
            <MenuAppBar setView={setView} />

            <div>
                {/* {view === 'NaverSignIn' && (<NaverSignIn />)} */}
                {/* 
                //# 삼항 비교 연산자
                //? 조건에 따라서 참일떄의 결과값과 거짓일때의 결과값을 지정해서
                //? 해당하는 경우의 값을 반환
                //? 조건 ? 참일 때의 결과값 : 거짓일 때의 결과값
                */}
                {/* if(조건){} else {if(조건) {} else {} } */}
                {/* 
                //^ <></> : 아무런 의미가 없는 빈태그
                */}
                {
                view === VIEW.NAVER ? (<NaverSignIn />) :
                view === VIEW.KAKAO ? (<KakaoSignIn />) :
                view === VIEW.TYPESCRIPT ? (<Es6TypeScript />) :
                view === VIEW.TSX ? (<JsxTsx />) :
                view === VIEW.HOOK ? (<Hook />) :
                view === VIEW.MUI ? (<Mui />) : (<></>)
                }
            </div>
        </div>
    )
}
