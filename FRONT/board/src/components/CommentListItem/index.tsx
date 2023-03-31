import React from 'react'

import { Box, Avatar, Typography, Divider } from '@mui/material'
import { Comment, ICommentItem } from 'src/interfaces'

interface Props{
    item: Comment;
}

export default function CommentListItem({ item } : Props) {

    const dateGap = Date.now() - Date.parse(item.writeDatetime);
    const before = Math.floor(dateGap / (1000 * 60))
    // console.log( dateGap / (1000 * 60))
  return (
    <Box>
        <Box sx={{ mb:'8px',display:'flex', alignItems:'center' }}>
            <Avatar sx={{ width:'32px', height:'32px', mr:'8px' }} src={item.writerProfileUrl ? item.writerProfileUrl : ''} />
            <Typography sx={{ fontSize:'16px', fontWeight:500, color:'rgba(0, 0, 0, 0.7)' }}>{item.writerNickname}</Typography>
            <Divider sx={{ mr:'8px', ml:'8px' }} orientation="vertical" flexItem variant="middle" />
            <Typography sx={{ fontSize:'16px', fontWeight:400, color:'rgba(0, 0, 0, 0.4)' }}>{before} 분전</Typography>
        </Box>
        <Typography sx={{ fontSize:'18px', lineHeight:'150%', fontWeight:500, color:'rgba(0, 0, 0, 0.7)' }}>{item.commentContent}</Typography>
    </Box>
  )
}
